package com.doctolib.adifazio.jspecify.nullaway;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public interface TokenExtractor {

    /**
     * Extracts a token from the given input string.
     * @param input the input string
     * @return the extracted token
     */
    @Nullable String extractToken(@NonNull String input);
}
