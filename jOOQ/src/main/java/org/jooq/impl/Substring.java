/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.function;
import static org.jooq.impl.DSL.inline;

import org.jooq.Configuration;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class Substring extends AbstractFunction<String> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -7273879239726265322L;

    Substring(Field<?>... arguments) {
        super("substring", SQLDataType.VARCHAR, arguments);
    }

    @Override
    final Field<String> getFunction0(Configuration configuration) {
        String functionName = "substring";

        switch (configuration.dialect().family()) {

            // [#430] Firebird has its own syntax
            case FIREBIRD: {
                if (getArguments().length == 2) {
                    return field("{substring}({0} {from} {1})", SQLDataType.VARCHAR, getArguments());
                }
                else {
                    return field("{substring}({0} {from} {1} {for} {2})", SQLDataType.VARCHAR, getArguments());
                }
            }

            /* [pro] xx
            xx xxxxxx xxx xxx xxx xxxxxx xxxxxxxx x xxxxxxxxx
            xxxx xxxx
            xxxx xxxxxxxxxx x
                xx xxxxxxxxxxxxxxxxxxxxxx xx xx x
                    xxxxxx xxxxxxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxxxxxxxxxxx
                x

                xx xxxxxxx xxxxxxxxx
                xxxx x
                    xxxxxx
                x
            x

            xx xxxxxx xxx xxxxxxxxxxxx xxxxxxxx xxxxxx xxxxx xxxxxxxx xxxxxxx
            xxxx xxxxxxx x
                xx xxxxxxxxxxxxxxxxxxxxxx xx xx x
                    xxxxxx xxxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxx xxx xxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxx
                x
                xxxx x
                    xxxxxx xxxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxx xxx xxxxxxxxxx xxxxxxxxxx xxx xxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxx
                x
            x

            xxxx xxxxxxx
                xxxxxxxxxxxx x xxxxxx
                xxxxxx

            xxxx xxxx
            xxxx xxxxxxx
            xx [/pro] */
            case DERBY:
            case SQLITE:
                functionName = "substr";
                break;
        }

        return function(functionName, SQLDataType.VARCHAR, getArguments());
    }
}
