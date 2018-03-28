
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
        for (int i = 0; n > 0; n--) {
            maior[i] = a[i];
            i++;
        }
        return maior;

    }

    double[] menorvetor(double[] a, int n) {
        double menor[] = new double[n];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] > a[j]) {
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }
        }
        int j = 0;
        for (int i =(a.length - 1) ; n > 0; n--) {
            menor[j] = a[i];
            i--;
            j++;
        }
        return menor;
    }
}
    
