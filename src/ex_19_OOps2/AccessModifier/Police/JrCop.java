package ex_19_OOps2.AccessModifier.Police;


    public class JrCop {
        public static void main(String[] args) {
            Cop jrCop = new Cop(10);
//        System.out.println(jrCop.gun);
            jrCop.canIShoot();
        }
    }
