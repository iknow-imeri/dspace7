/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.text.filter;

import com.ibm.icu.text.Normalizer2;

/**
 * Decompose diacritic characters to character + diacritic
 *
 * @author Graham Triggs
 */
public class DecomposeDiactritics implements TextFilter {
    @Override
    public String filter(String str) {
        return Normalizer2.getNFDInstance().normalize(str);
    }

    @Override
    public String filter(String str, String lang) {
        return Normalizer2.getNFDInstance().normalize(str);
    }
}
