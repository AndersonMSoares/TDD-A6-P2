/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarkVII
 */
class Vetort {

    double[] maiorvetor(double[] a, int n) {
        double maior[] = new double[n];

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0 ; n >0; n--){
            maior[i] = a[i];
            i++;
        }
        return maior;
        
    }

    double[] menorvetor(double[] a, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
