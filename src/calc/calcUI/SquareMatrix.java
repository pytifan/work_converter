/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.calcUI;

/**
 *
 * @author alex
 */
public class SquareMatrix {
    final static double SquareCff[][] = {
            /*кв.нанометр*/{1, 1E-6, 1E-12, 1E-14, 10e-16, 10e-18, 10e-20, 10e-22, 10e-24, 1.0725e-26, 3.861e-25, 1.5444e-24, 2.4711e-22, 9.8842e-22, 3.9537e-20, 1.0764e-19, 1.196e-18, 1.0764e-17, 1.55e-15},//Кв. нанометр
            /*кв.микрометр*/ {1e6, 1, 1E-6, 1E-8, 1E-10, 1E-12, 1E-14, 10e-16, 10e-18, 1.0725e-20, 3.861e-19, 1.5444e-18, 2.4711e-16, 9.8842e-16, 3.9537e-14, 1.0764e-13, 1.196e-12, 1.0764e-11, 1.55e-9},//кв.микрометр
            /*мм кв.*/ {1e12, 1e6, 1, 0.01, 0.0001, 1E-6, 1E-8, 1E-10, 1E-12, 1.0725e-14, 3.861e-13, 1.5444e-12, 2.4711e-10, 9.8842e-10, 3.9537e-8, 1.0764e-7, 1.196e-6, 1.0764e-5, 0.0016},//Миллиметр кв.
            /*см кв.*/ {1e14, 1e8, 100, 1, 0.01, 0.0001, 1E-6, 1E-8, 1E-10, 1.0725e-12, 3.861e-11, 1.5444e-10, 2.4711e-8, 9.8842e-8, 3.9537e-6, 1.0764e-5, 0.0001, 0.0011, 0.155},//см кв.
            /*дц кв.*/ {1e16, 1e10, 1e4, 100, 1, 0.01, 0.0001, 1E-6, 1E-8, 1.0725e-10, 3.861e-9, 1.5444e-8, 2.4711e-6, 9.8842e-6, 0.0004, 0.0011, 0.012, 0.1076, 15.5},//дц кв.
            /*м кв.*/ {1e18, 1e12, 1e6, 1e4, 100, 1, 0.01, 0.0001, 1E-6, 1.0725e-8, 3.861e-7, 1.5444e-6, 0.0002, 0.001, 0.0395, 0.1076, 1.196, 10.7639, 1550.003},//м кв.
            /*Ар*/ {1e20, 1e14, 1e8, 1e6, 1e4, 100, 1, 0.01, 0.0001, 1.0725e-6, 3.861e-5, 0.0002, 0.0247, 0.0988, 3.9537, 10.7639, 119.599, 1076.391, 155000.3},//Ар
            /*Гектар*/ {1e22, 1e16, 1e10, 1e8, 1e6, 1e4, 100, 1, 0.01, 0.0001, 0.0039, 0.0154, 2.4711, 9.8842, 395.3687, 1076.391, 11959.9, 107639.1, 15500030},//Гектар
            /*км кв.*/ {1e24, 1e18, 1e12, 1e10, 1e8, 1e6, 1e4, 100, 1, 0.0107, 0.3861, 1.5444, 247.1055, 988.422, 39536.87, 107639.1, 1195990, 10763910, 1550003000},//км кв.
            /*Тауншип*/ {9.324e25, 9.324e19, 9.324e13, 9.324e11, 9.324e9, 9.324e7, 932395.7162, 9323.9572, 93.2396, 1, 36, 144, 23040.011, 92160.0439, 3686400.822, 1.0036e7, 1.1151e8, 1.0036e9, 1.4452e11},//Тауншип
            /*миля кв.*/ {2.59e24, 2.59e18, 2.59e12, 2.59e10, 2.59e8, 2589987.8322, 25899.8783, 258.9988, 2.59, 0.0278, 1, 4, 640.0002, 2560.001, 102400.0122, 278783.9593, 3097599.5475, 2.7878e7, 4.0145e9},//миля кв.
            /*Хомстед*/ {6.475e23, 6.475e17, 6.475e11, 6.475e9, 6.475e7, 647496.8742, 6474.9687, 64.7497, 0.6475, 0.0069, 0.25, 1, 160, 640.0002, 25599.9997, 69695.9808, 774399.7866, 6969598.0793, 1.0036e9},//Хомстед
            /*Акр*/ {4.0469e21, 4.0469e15, 4.0469e9, 4.0469e7, 404685.4481, 4046.8545, 40.4685, 0.4047, 0.004, 4.3403e-5, 0.0016, 0.0062, 1, 4, 160, 435.5998, 4839.9975, 43559.9774, 6272636.5864},//Акр
            /*Руд*/ {1.0117e21, 1.0117e15, 1.0117e9, 10117136.203, 101171.362, 1011.7136, 10.1171, 0.1012, 0.001, 1.0851e-5, 0.0004, 0.0016, 0.25, 1, 40, 108.8999, 1209.9994, 10889.9944, 1568159.1466},//Руд
            /*Кв.род*/ {2.5293e19, 2.5293e13, 2.5293e7, 252928.469, 2529.2847, 25.2928, 0.2529, 0.0025, 2.5293e-5, 2.7127e-7, 9.7656e-6, 3.9063e-5, 0.0063, 0.025, 1, 2.7225, 30.25, 272.2499, 39203.9886},//Род кв.
            /*Сквайр*/ {9.2903e18, 9.2903e12, 9290304.3597, 92903.0436, 929.0304, 9.2903, 0.0929, 0.0009, 9.2903e-6, 9.9639e-8, 3.587e-6, 1.4348e-5, 0.0023, 0.0092, 0.3673, 1, 11.1111, 100, 14399.9996},//Сквайр
            /*Кв.ярд*/ {8.3613e17, 8.3613e11, 836127.3924, 8361.2739, 83.6127, 0.8361, 0.0084, 0.0001, 8.3613e-7, 8.9675e-9, 3.2283e-7, 1.2913e-6, 0.0002, 0.0008, 0.0331, 0.09, 1, 9, 1296},//Ярд кв.
            /*Кв.фут*/ {9.2903e16, 9.2903e10, 92903.0436, 929.0304, 9.2903, 0.0929, 0.0009, 9.2903e-6, 9.2903e-8, 9.9639e-10, 3.587e-8, 1.4348e-7, 2.2957e-5, 0.0001, 0.0037, 0.01, 0.1111, 1, 144},//Фут кв.
            /*Кв.дюйм*/ {6.4516e14, 6.4516e8, 645.16, 6.4516, 0.0645, 0.0006, 6.4516e-6, 6.4516e-8, 6.4516e-10, 6.9194e-12, 2.491e-10, 9.9639e-10, 1.5942e-7, 6.3769e-7, 2.5508e-5, 0.0001, 0.0008, 0.0069, 1}//Дюйм кв.
        };
}
