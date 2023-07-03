public class Newton {
    //private int middle;
    double func (double a){
        return Math.cos(Math.pow(a,5)) + Math.pow(a,4) - 345.3 * a -23;
    }

    double funcNewton(double min, double max){
        double mid = (min + max) / 2;
        if (mid - min < 0.0000000001){
            return (min + mid) / 2;
        }
        else {
            if (func(min) * func(mid) < 0) {
                return funcNewton(min, mid);
            } else {
                return funcNewton(mid, max);
            }
        }
    }
}
