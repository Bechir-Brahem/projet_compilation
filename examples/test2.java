package examples;
/* ===========================================================
  CECI EST UN COMMENTAIRE qui prendra fin a la prochaine
  accolade fermante

  TP1 - ift2030 - automne 2002
  ============================================================ */

class Factorial{
        public static void main(String[] a){
        System.out.println(new Fac().ComputeFac(10));
    }
}

/* ====================================================
   Classe Fac
   ==================================================== */
class Fac {
    public int ComputeFac(int num){
        int num_aux;
        if (num < 1)
            num_aux = 1;
        else
            num_aux = num * (this.ComputeFac(num-1)) ;/*mechant programme n'est pas ?*/ 
        return num_aux ;
        }
}