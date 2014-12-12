/*
 * Copyright (C) 2014 Mobs and Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mobsandgeeks.saripaar.tests.validation;

import com.mobsandgeeks.saripaar.AnnotationRule;

public class HometownZipCodeRule extends AnnotationRule<HometownZipCode, String> {

    protected HometownZipCodeRule(HometownZipCode hometownZipCode) {
        super(hometownZipCode);
    }

    @Override
    public boolean isValid(String data) {
        return "635001".equals(data);
    }

}