/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.calcUI;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

class Converter {
//convertation with help of two-dimensions matrix
//choosing needed coefficient-matrix with "if" - operator
double result;
    double convert(int i, int j, String strFrom, String Unit, boolean Shortlist) {

        final String Digits = "(\\p{Digit}+)";
        final String HexDigits = "(\\p{XDigit}+)";
        // an exponent is 'e' or 'E' followed by an optionally 
        // signed decimal integer.
        final String Exp = "[eE][+-]?" + Digits;
        final String fpRegex =
                ("[\\x00-\\x20]*" + // Optional leading "whitespace"
                "[+-]?(" + // Optional sign character
                "NaN|" + // "NaN" string
                "Infinity|"
                + // "Infinity" string
                // A decimal floating-point string representing a finite positive
                // number without a leading sign has at most five basic pieces:
                // Digits . Digits ExponentPart FloatTypeSuffix
                // 
                // Since this method allows integer-only strings as input
                // in addition to strings of floating-point literals, the
                // two sub-patterns below are simplifications of the grammar
                // productions from the Java Language Specification, 2nd 
                // edition, section 3.10.2.
                // Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
                "(((" + Digits + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|"
                + // . Digits ExponentPart_opt FloatTypeSuffix_opt
                "(\\.(" + Digits + ")(" + Exp + ")?)|"
                + // Hexadecimal strings
                "(("
                + // 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
                "(0[xX]" + HexDigits + "(\\.)?)|"
                + // 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
                "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")"
                + ")[pP][+-]?" + Digits + "))"
                + "[fFdD]?))"
                + "[\\x00-\\x20]*");// Optional trailing "whitespace"

        boolean inStr = (strFrom != null) && (strFrom.length() > 0);

        DecimalFormat df = new DecimalFormat("#,##0.###E0");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        df.setDecimalFormatSymbols(symbols);

        if (Unit.equals("Длина") || Unit.equals("Lenght")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = Double.parseDouble(strFrom) * DlinaMatrix.DlinaCff[i][j];

            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                    result = df.parse(strFrom).doubleValue() * DlinaMatrix.DlinaCff[i][j];
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        } else if (Unit.equals("Площадь") || Unit.equals("Area")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = Double.parseDouble(strFrom) * SquareMatrix.SquareCff[i][j];
            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                    result = df.parse(strFrom).doubleValue() * SquareMatrix.SquareCff[i][j];
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        } else if (Unit.equals("Объем") || Unit.equals("Volume")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = Double.parseDouble(strFrom) * VolumeMatrix.VolumeCff[j][i];

            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                    result = df.parse(strFrom).doubleValue() * VolumeMatrix.VolumeCff[j][i];
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        }
        else if (Unit.equals("Плотность") || Unit.equals("Density")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = Double.parseDouble(strFrom) * DensityMatrix.DensityCff[j][i];

            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                    result = df.parse(strFrom).doubleValue() * DensityMatrix.DensityCff[j][i];
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        }
                else if (Unit.equals("Температура") || Unit.equals("Temperature")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = Double.parseDouble(strFrom) * TemperatureMatrix.TempCff[j][i];
            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                    result = df.parse(strFrom).doubleValue() * TemperatureMatrix.TempCff[j][i];
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        }
                else if (Unit.equals("Давление") || Unit.equals("Pressure")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = (!Shortlist)?(Double.parseDouble(strFrom) * PressureMatrix.PressCff[j][i]):
                        (Double.parseDouble(strFrom) * PressureMatrix.PressCffshort[j][i]);
            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                   result = (!Shortlist)? (df.parse(strFrom).doubleValue() * PressureMatrix.PressCff[j][i]):
                           (df.parse(strFrom).doubleValue() * PressureMatrix.PressCff[j][i]);
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        }
           else if (Unit.equals("Скорость") || Unit.equals("Velocity")) {
            if (inStr && Pattern.matches(fpRegex, strFrom)) {
                result = Double.parseDouble(strFrom) * VelocityMatrix.VelocityCff[j][i];
            } else if (inStr && !Pattern.matches(fpRegex, strFrom)) {
                try {
                    result = df.parse(strFrom).doubleValue() * VelocityMatrix.VelocityCff[j][i];
                } catch (ParseException ex) {
                    Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                result = 0.0;
            }
        }
        return result;
    }

    public String myFormatter(double res, boolean separator) {
        DecimalFormat df = new DecimalFormat("#,##0.###E0");
        df.setMaximumFractionDigits(5);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);

        if (separator) {
            DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
            dfs.setDecimalSeparator(',');
            df.setDecimalFormatSymbols(dfs);
        } else {
            DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
            dfs.setDecimalSeparator('.');
            df.setDecimalFormatSymbols(dfs);
        }
        return df.format(res);
    }
}