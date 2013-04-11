/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.calcUI;

public class UnitsChooser {
    protected javax.swing.JComboBox FromCmBox;
    protected javax.swing.JComboBox ToCmBx;
    protected javax.swing.JComboBox UnitChooseCBx;

    void choose(int UnitChooseCBxIndex, int FromCmBoxIndex, int ToCmBxIndex, boolean LangMenuItem, boolean UnitsListForm) {
     UnitChooseCBx.setModel(new javax.swing.DefaultComboBoxModel((LangMenuItem) ? 
           (new String [] {"Lenght","Area","Volume","Density","Temperature","Pressure","Velocity"}):
           (new String [] {"Длина","Площадь","Объем","Плотность","Температура","Давление","Скорость"})));
        switch (UnitChooseCBxIndex) {
            case 0://dlina
                if (LangMenuItem) {//Russian
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "ангстрем", "нанометр", "микрометр", "мм", "cм", "дц", "м", "чейн", "км", "дюйм", "фут",
                        "ярд", "мил(mil)", "морская миля", "морская сажень"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "ангстрем", "нанометр", "микрометр", "мм", "cм", "дц", "м", "чейн", "км", "дюйм", "фут",
                        "ярд", "мил(mil)", "морская миля", "морская сажень"}));
                } else {//in English
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Angstrom (Å)", "Nanometre (nm)", "Micrometre (µm)", "Millimetre (mm)", "Centimetre (cm)",
                        "Decimetre (dm)", "Metre (m)", "Chain", "Kilometre (km)", "Inch (in)", "Foot (ft)",
                        "Yard (yd)", "Mil(mil)", "Sea mile", "Fathom"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Angstrom (Å)", "Nanometre (nm)", "Micrometre (µm)", "Millimetre (mm)", "Centimetre (cm)",
                        "Decimetre (dm)", "Metre (m)", "Chain", "Kilometre (km)", "Inch (in)", "Foot (ft)",
                        "Yard (yd)", "Mil(mil)", "Sea mile", "Fathom"}));
                }
                break;
            case 1://square
                if (LangMenuItem) {//Russian
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "нанометр²", "микрометр²", "мм²", "см²", "дц²", "м²", "Ар", "Гектар", "км²", "Тауншип",
                        "миля²", "Хомстед", "Акр", "Руд", "Род²", "Сквайр", "Ярд²", "Фут²", "Дюйм²"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "нанометр²", "микрометр²", "мм²", "см²", "дц²", "м²", "Ар", "Гектар", "км²", "Тауншип",
                        "миля²", "Хомстед", "Акр", "Руд", "Род²", "Сквайр", "Ярд²", "Фут²", "Дюйм²"}));
                } else {//in English
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "nanometre²", "micrometre²", "millimetre²", "centimetre² (cm²)", "decimetre²",
                        "metre²", "Are (a)", "Hectare (ha)", "kilometre²", "Township", "mile²", "Homestead",
                        "Acre", "Rood", "rod²", "Square", "yard² (sy²)", "foot² (ft²)", "inch² (in²)"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "nanometre²", "micrometre²", "millimetre²", "centimetre² (cm²)", "decimetre²",
                        "metre²", "Are (a)", "Hectare (ha)", "kilometre²", "Township", "mile²", "Homestead",
                        "Acre", "Rood", "rod²", "Square", "yard² (sy²)", "foot² (ft²)", "inch² (in²)"}));
                }
                break;
            case 2://volume
                if (LangMenuItem) { //in Russian
                    //if (UnitsListForm){
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "акр-фут", "акр-дюйме", "attoliter", "баррель", "баррель (нефти)", "ванна (библейский)", "досковой фут", "бушель", "бушель (UK)", "кабина (библейский)",
                        "cc", "ccf", "сантилитр", "Кор (библейский)", "шнур", "сантиметр³", "фут³", "дюйм³", "метр³", "ярд³",
                        "чашка", "чашка (UK)", "децилитр", "decistere", "декалитр", "dekastere", "десертная ложка", "десертная ложка (UK)", "драхма", "драхма (UK)",
                        "капля", "сухая пинта", "сухая кварта", "exaliter", "фемтолитр", "галлон", "галлон (UK)", "гигалитр", "гилл", "гилл (UK)",
                        "гектолитр", "Хин (библейский)", "бочка", "Гомер (библейский)", "сто³ футов", "килолитр", "литр", "log (библейский)", "мегалитр", "микролитр",
                        "миллилитр", "миним", "миним (UK)", "нанолитр", "унция", "унция (UK)", "пек", "пек (UK)", "петалитр", "пиколитр",
                        "пинта", "пинта (UK)", "кварта", "кварта (UK)", "ster", "ст.ложка", "ст.ложка (UK)", "Таза (испанский)", "ч. ложка", "ч. ложка (UK)",
                        "teraliter", "тун"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "акр-фут", "акр-дюйме", "attoliter", "баррель", "баррель (нефти)", "ванна (библейский)", "досковой фут", "бушель", "бушель (UK)", "кабина (библейский)",
                        "cc", "ccf", "сантилитр", "Кор (библейский)", "шнур", "сантиметр³", "фут³", "дюйм³", "метр³", "ярд³",
                        "чашка", "чашка (UK)", "децилитр", "decistere", "декалитр", "dekastere", "десертная ложка", "десертная ложка (UK)", "драхма", "драхма (UK)",
                        "капля", "сухая пинта", "сухая кварта", "exaliter", "фемтолитр", "галлон", "галлон (UK)", "гигалитр", "гилл", "гилл (UK)",
                        "гектолитр", "Хин (библейский)", "бочка", "Гомер (библейский)", "сто³ футов", "килолитр", "литр", "log (библейский)", "мегалитр", "микролитр",
                        "миллилитр", "миним", "миним (UK)", "нанолитр", "унция", "унция (UK)", "пек", "пек (UK)", "петалитр", "пиколитр",
                        "пинта", "пинта (UK)", "кварта", "кварта (UK)", "ster", "ст.ложка", "ст.ложка (UK)", "Таза (испанский)", "ч. ложка", "ч. ложка (UK)",
                        "teraliter", "тун"}));
                    //} else {//shotList
//          FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
//    "мкл", "мм³", "миллилитр", "см³", "сантилитр", "децилитр", "литр", "дц³", "декалитр", "гектолитр", "м³", "км³",
//    /*GB*/ "баррельGB", "бушельGB", "пэкGB", "галлонGB", "квартаGB", "пинтаGB", "жидкая унцияGB",
//    /*USA_dry:*/ "баррельUSA,dry", "бушельUSA,dry", "пэкUSA,dry", "галлонUSA,dry","квартаUSA,dry", "пинтаUSA,dry", "гиллUSA,dry", "досковый футUSA,dry",
//    /*USA_luquid:*/ "акрофутUSA,luquid", "ярд³USA,luquid", "баррельUSA,luquid","фут³USA,luquid", "галлонUSA,luquid", "квартаUSA,luquid",
//    "пинтаUSA,luquid","гиллUSA,luquid", "жидкая унцияUSA,luquid", "дюйм³USA,luquid","жидкая драхмаUSA,luquid", "минимUSA,luquid"}));
//             ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
//    "мкл", "мм³", "миллилитр", "см³", "сантилитр", "децилитр", "литр", "дц³", "декалитр", "гектолитр", "м³", "км³",
//    /*GB*/ "баррельGB", "бушельGB", "пэкGB", "галлонGB", "квартаGB", "пинтаGB", "жидкая унцияGB",
//    /*USA_dry:*/ "баррельUSA,dry", "бушельUSA,dry", "пэкUSA,dry", "галлонUSA,dry","квартаUSA,dry", "пинтаUSA,dry", "гиллUSA,dry", "досковый футUSA,dry",
//    /*USA_luquid:*/ "акрофутUSA,luquid", "ярд³USA,luquid", "баррельUSA,luquid","фут³USA,luquid", "галлонUSA,luquid", "квартаUSA,luquid",
//    "пинтаUSA,luquid","гиллUSA,luquid", "жидкая унцияUSA,luquid", "дюйм³USA,luquid","жидкая драхмаUSA,luquid", "минимUSA,luquid"}));
                    //}
                } else {//in English
                    //if (longList)
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "acre-foot", "acre-inch", "attoliter", "barrel", "barrel (oil)", "bath (Biblical)", "board foot", "bushel", "bushel (UK)", "cab (Biblical)",
                        "cc", "ccf", "centiliter", "cor (Biblical)", "cord", "cubic centimeter", "cubic foot", "cubic inch", "cubic meter", "cubic yard",
                        "cup", "cup (UK)", "deciliter", "decistere", "dekaliter", "dekastere", "dessertspoon", "dessertspoon (UK)", "dram", "dram (UK)",
                        "drop", "dry pint", "dry quart", "exaliter", "femtoliter", "gallon", "gallon (UK)", "gigaliter", "gill", "gill (UK)",
                        "hectoliter", "hin (Biblical)", "hogshead", "homer (Biblical)", "hundred-cubic foot", "kiloliter", "liter", "log (Biblical)", "megaliter", "microliter",
                        "milliliter", "minim", "minim (UK)", "nanoliter", "ounce", "ounce (UK)", "peck", "peck (UK)", "petaliter", "picoliter",
                        "pint", "pint (UK)", "quart", "quart (UK)", "stere", "tablespoon", "tablespoon (UK)", "Taza (Spanish)", "teaspoon", "teaspoon (UK)",
                        "teraliter", "tun"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "acre-foot", "acre-inch", "attoliter", "barrel", "barrel (oil)", "bath (Biblical)", "board foot", "bushel", "bushel (UK)", "cab (Biblical)",
                        "cc", "ccf", "centiliter", "cor (Biblical)", "cord", "cubic centimeter", "cubic foot", "cubic inch", "cubic meter", "cubic yard",
                        "cup", "cup (UK)", "deciliter", "decistere", "dekaliter", "dekastere", "dessertspoon", "dessertspoon (UK)", "dram", "dram (UK)",
                        "drop", "dry pint", "dry quart", "exaliter", "femtoliter", "gallon", "gallon (UK)", "gigaliter", "gill", "gill (UK)",
                        "hectoliter", "hin (Biblical)", "hogshead", "homer (Biblical)", "hundred-cubic foot", "kiloliter", "liter", "log (Biblical)", "megaliter", "microliter",
                        "milliliter", "minim", "minim (UK)", "nanoliter", "ounce", "ounce (UK)", "peck", "peck (UK)", "petaliter", "picoliter",
                        "pint", "pint (UK)", "quart", "quart (UK)", "stere", "tablespoon", "tablespoon (UK)", "Taza (Spanish)", "teaspoon", "teaspoon (UK)",
                        "teraliter", "tun"}));
                    //} else { //shotList
//          FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
//    "µl", "mm³", "ml", "cm³", "cl", "dl", "Litre", "dm³", "Decalitre", "hl", "m³", "km³",
//    /*GB*/ "Barrel GB", "Bushel GB (bu)", "Peck GB (pk)", "Gallon GB (gal)", "Quart GB (qt)", "Pint GB (pt)", "Fluid ounce GB (oz)",
//    /*USA_dry:*/ "Barrel USA,dry", "Bushel USA,dry (bu)", "Peck USA,dry (pk)", "Gallon USA,dry (gal)", "Quart USA,dry (qt)", "Pint USA,dry (pt)", "Gill USA,dry", "Board foot USA,dry (FBM)",
//    /*USA_luquid:*/ "Acre foot USA,luquid", "Cubic yard USA,luquid (yd³)", "Barrel USA,luquid",
//    "Cubic foot USA,luquid (ft³)", "Gallon USA,luquid (gal)", "Quart USA,luquid (qt)", "Pint USA,luquid (pt)",
//    "Gill USA,luquid", "Fluid ounce USA,luquid (oz)", "Cubic inch USA,luquid (in³)",
//    "Fluid dram USA,luquid", "Minim USA,luquid"}));
//             ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
//    "µl", "mm³", "ml", "cm³", "cl", "dl", "Litre", "dm³", "Decalitre", "hl", "m³", "km³",
//    /*GB*/ "Barrel GB", "Bushel GB (bu)", "Peck GB (pk)", "Gallon GB (gal)", "Quart GB (qt)", "Pint GB (pt)", "Fluid ounce GB (oz)",
//    /*USA_dry:*/ "Barrel USA,dry", "Bushel USA,dry (bu)", "Peck USA,dry (pk)", "Gallon USA,dry (gal)", "Quart USA,dry (qt)", "Pint USA,dry (pt)", "Gill USA,dry", "Board foot USA,dry (FBM)",
//    /*USA_luquid:*/ "Acre foot USA,luquid", "Cubic yard USA,luquid (yd³)", "Barrel USA,luquid",
//    "Cubic foot USA,luquid (ft³)", "Gallon USA,luquid (gal)", "Quart USA,luquid (qt)", "Pint USA,luquid (pt)",
//    "Gill USA,luquid", "Fluid ounce USA,luquid (oz)", "Cubic inch USA,luquid (in³)",
//    "Fluid dram USA,luquid", "Minim USA,luquid"}));
                    //}
                }
                break;
            case 3://density
                if (LangMenuItem) {//Russian
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "attogram/л", "centigram/л", "дециграмм/л", "dekagram/литр", "exagram/л", "femtogram/л", "гигаграмм/л", "г/см³", "г/м³", "г/мм³",
                        "г/л", "гектограмм/л", "кг/см³", "кг/м³", "кг/л", "мегаграмм/л", "микрограмм/л", "миллиграмм/см³", "миллиграмм/кубометр", "миллиграмм/мм³",
                        "миллиграмм/л", "нанограм/л", "унция/фут³", "унция/дюйм³", "унция/галлон", "petagram/л", "picogram/л", "фунт/фут³", "фунт/дюйм³", "фунт/галлон",
                        "psi/1000 футов", "Teragram/л", "тон/ярд³"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "attogram/л", "centigram/л", "дециграмм/л", "dekagram/литр", "exagram/л", "femtogram/л", "гигаграмм/л", "г/см³", "г/м³", "г/мм³",
                        "г/л", "гектограмм/л", "кг/см³", "кг/м³", "кг/л", "мегаграмм/л", "микрограмм/л", "миллиграмм/см³", "миллиграмм/кубометр", "миллиграмм/мм³",
                        "миллиграмм/л", "нанограм/л", "унция/фут³", "унция/дюйм³", "унция/галлон", "petagram/л", "picogram/л", "фунт/фут³", "фунт/дюйм³", "фунт/галлон",
                        "psi/1000 футов", "Teragram/л", "тон/ярд³"}));
                } else {//in English
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "attogram/liter", "centigram/liter", "decigram/liter", "dekagram/liter", "exagram/liter", "femtogram/liter", "gigagram/liter", "gram/centimeter³", "gram/meter³", "gram/millimeter³",
                        "gram/liter", "hectogram/liter", "kilogram/centimeter³", "kilogram/meter³", "kilogram/liter", "megagram/liter", "microgram/liter", "milligram/centimeter³", "milligram/meter³", "milligram/millimeter³",
                        "milligram/liter", "nanogram/liter", "ounce/foot³", "ounce/inch³", "ounce/gallon", "petagram/liter", "picogram/liter", "pound/foot³", "pound/inch³", "pound/gallon",
                        "psi/1000 feet", "teragram/liter", "ton/yard³"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "attogram/liter", "centigram/liter", "decigram/liter", "dekagram/liter", "exagram/liter", "femtogram/liter", "gigagram/liter", "gram/centimeter³", "gram/meter³",
                        "gram/millimeter³", "gram/liter", "hectogram/liter", "kilogram/centimeter³", "kilogram/meter³", "kilogram/liter", "megagram/liter", "microgram/liter", "milligram/centimeter³", "milligram/meter³",
                        "milligram/millimeter³", "milligram/liter", "nanogram/liter", "ounce/foot³", "ounce/inch³", "ounce/gallon", "petagram/liter", "picogram/liter", "pound/foot³",
                        "pound/inch³", "pound/gallon", "psi/1000 feet", "teragram/liter", "ton/yard³"}));
                }
                break;
            case 4://temperature
                if (LangMenuItem) {//Russian
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Цельсий", "Фаренгейт", "Кельвин", "Ранкина", "Реомюра"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Цельсий", "Фаренгейт", "Кельвин", "Ранкина", "Реомюра"}));
                } else {//in English
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Celsius", "Fahrenheit", "Kelvin", "Rankine", "Réaumur"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "Celsius", "Fahrenheit", "Kelvin", "Rankine", "Réaumur"}));
                }
                break;
            case 5://pressure
                if (LangMenuItem) {//Russian
                    if (UnitsListForm) {
                        FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "атмосфера", "attopascal", "бар", "см рт.ст.(0°C)", "см воды (4°C)", "centipascal", "деципаскаль", "декапаскаль", "дин/сантиметр²", "exapascal",
                            "femtopascal", "фут водой (60°F)", "gigapascal", "гектопаскаль", "дюйм ртути (32°F)", "дюйм воды (60°F)", " кг/см²", "кг/м²", "кг/мм²", "килоньютон/м²",
                            "килопаскаль", "кип/дюйм²", "МПа", "микробар", "micropascal", "миллибар", "мм ртути (0°C)", "миллипаскаль", "нанопаскаль", "Ньютон/см²", "ньютон/м²",
                            "ньютон/мм²", "Pascal", "петапаскаль", "пикопаскаль", "фунт/фут²", "фунт/дюйм²", "пси", "терапаскаль", "т/фут²", "т/дюйм²", "торр"}));
                        ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "атмосфера", "attopascal", "бар", "см рт.ст.(0°C)", "см воды (4°C)", "centipascal", "деципаскаль", "декапаскаль", "дин/сантиметр²", "exapascal",
                            "femtopascal", "фут водой (60°F)", "gigapascal", "гектопаскаль", "дюйм ртути (32°F)", "дюйм воды (60°F)", " кг/см²", "кг/м²", "кг/мм²", "килоньютон/м²",
                            "килопаскаль", "кип/дюйм²", "МПа", "микробар", "micropascal", "миллибар", "мм ртути (0°C)", "миллипаскаль", "нанопаскаль", "Ньютон/см²", "ньютон/м²",
                            "ньютон/мм²", "Pascal", "петапаскаль", "пикопаскаль", "фунт/фут²", "фунт/дюйм²", "пси", "терапаскаль", "т/фут²", "т/дюйм²", "торр"}));
                    } else {
                        FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "атмосфера", "Бар", "дюйм ртуть (32°F)", "кг/см²", "килопаскаль", "МПа", "мм рт (0°C)", "Паскаль", "фунт/дюйм²"}));
                        ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "атмосфера", "Бар", "дюйм ртуть (32°F)", "кг/см²", "килопаскаль", "МПа", "мм рт (0°C)", "Паскаль", "фунт/дюйм²"}));
                    }
                } else {//in English
                    if (UnitsListForm) {
                        FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "atmosphere", "attopascal", "bar", "cm mercury (0°C)", "cm water (4°C)", "centipascal", "decipascal", "dekapascal", "dyne/centimeter²", "exapascal",
                            "femtopascal", "foot water (60°F)", "gigapascal", "hectopascal", "inch mercury (32°F)", "inch water (60°F)", "kilogram/cm²", "kilogram/m²", "kilogram/mm²", "kilonewton/m²",
                            "kilopascal", "kip/inch²", "megapascal", "microbar", "micropascal", "millibar", "mm mercury (0°C)", "millipascal", "nanopascal", "newton/cm²", "newton/m²",
                            "newton/mm²", "pascal", "petapascal", "picopascal", "pound/foot²", "pound/inch²", "psi", "terapascal", "ton/foot²", "ton/inch²", "torr"}));
                        ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "atmosphere", "attopascal", "bar", "cm mercury (0°C)", "cm water (4°C)", "centipascal", "decipascal", "dekapascal", "dyne/centimeter²", "exapascal",
                            "femtopascal", "foot water (60°F)", "gigapascal", "hectopascal", "inch mercury (32°F)", "inch water (60°F)", "kilogram/cm²", "kilogram/m²", "kilogram/mm²", "kilonewton/m²",
                            "kilopascal", "kip/inch²", "megapascal", "microbar", "micropascal", "millibar", "mm mercury (0°C)", "millipascal", "nanopascal", "newton/cm²", "newton/m²",
                            "newton/mm²", "pascal", "petapascal", "picopascal", "pound/foot²", "pound/inch²", "psi", "terapascal", "ton/foot²", "ton/inch²", "torr"}));
                    } else {
                        FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "atmosphere", "bar", "inch mercury (32°F)", "kilogram/cm²", "kilopascal", "megapascal", "mm mercury (0°C)", "pascal", "pound/inch²"}));
                        ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                            "atmosphere", "bar", "inch mercury (32°F)", "kilogram/cm²", "kilopascal", "megapascal", "mm mercury (0°C)", "pascal", "pound/inch²"}));
                    }
                }
                break;
            case 6://velocity
                if (LangMenuItem) {//Russian
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "см/час", "см/мин", "см/с", "фут/час", "фут/мин", "фут/сек", "км/час", "км/мин", "км/с", "узлов",
                        "ск.света", "Маха (на уровне моря)", "Маха (SI)", "м/час", "м/мин", "м/сек", "миль/час", "миль/мин", "миль/сек", "ярд/час",
                        "ярд/мин", "ярд/сек"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "см/час", "см/мин", "см/с", "фут/час", "фут/мин", "фут/сек", "км/час", "км/мин", "км/с", "узлов",
                        "ск.света", "Маха (на уровне моря)", "Маха (SI)", "м/час", "м/мин", "м/сек", "миль/час", "миль/мин", "миль/сек", "ярд/час",
                        "ярд/мин", "ярд/сек"}));
                } else {//in English
                    FromCmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "cm/hour", "cm/minute", "cm/second", "foot/hour", "foot/minute", "foot/second", "km/hour", "km/minute", "km/second", "knot",
                        "light", "mach (at sea level)", "mach (SI)", "m/hour", "m/minute", "m/second", "mile/hour", "mile/minute", "mile/second", "yard/hour",
                        "yard/minute", "yard/second"}));
                    ToCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
                        "cm/hour", "cm/minute", "cm/second", "foot/hour", "foot/minute", "foot/second", "km/hour", "km/minute", "km/second", "knot",
                        "light", "mach (at sea level)", "mach (SI standard)", "m/hour", "m/minute", "m/second", "mile/hour", "mile/minute", "mile/second", "yard/hour",
                        "yard/minute", "yard/second"}));
                }
                break;
        }
    }
}
