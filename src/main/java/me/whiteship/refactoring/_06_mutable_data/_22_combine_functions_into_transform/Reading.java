package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

/**
 *
 * record
 * final, invoke once , no setter
 */

public record Reading(String customer, double quantity, Month month, Year year) {
}
