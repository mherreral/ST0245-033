/*
Clase que contiene los cinco ejercicios de Array2
*/
package lab2;

/**
 *
 * @author manuh
 */
public class Arrays2 {

    public int countEvens(int[] nums) {
        int contador = 0;
        int longi = nums.length;
        for (int i = 0; i < longi; i++) {
            if (nums[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int sum13(int[] nums) {
        int suma = 0;
        int longi = nums.length;
        for (int i = 0; i < longi; i++) {
            if (nums[i] != 13) {
                suma += nums[i];
            } else if (i <= longi - 1) {
                i++;
            }
        }
        return suma;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int contador = 0;
        int menos = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                if (Math.abs(nums1[i] - nums2[i]) <= 2) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public boolean isEverywhere(int[] nums, int val) {
        boolean salida = true;
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                salida = false;
            }
        }
        return salida;
    }

    public int[] fizzArray(int n) {
        int[] nuevo = new int[n];
        for (int i = 0; i < n; i++) {
            nuevo[i] = i;
        }
        return nuevo;
    }
}
