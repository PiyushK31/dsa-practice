// public class pow {

//     public static int pow(int p, int q) {
//         // base case:-
//         if (q == 0)
//             return 1;
//         return pow(p, q - 1) * p;
//     }

//     public static void main(String args[]) {
//         System.out.println pow(10, 10));
//     }
// }

//We have better approch to this to reduce time comilixity:-
package Recursion;

public class PowerOFnum {

    public static int pow(int p, int q) {
        // base case:-
        if (q == 0)
            return 1;

        // rec case:-
        int smallpow = pow(p, q / 2);
        if (q % 2 == 0) {
            return smallpow * smallpow;
        } else {
            return p * smallpow * smallpow;
        }
    }

    public static void main(String args[]) {
        System.out.println(pow(2, 2));
    }
}