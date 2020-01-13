package classes;

public class Carpet {


        //do not change -- Start
        public double width,length,unitPrice,totalPrice;
        public boolean isPersian;
        //do not change -- End

        //Add constructors below
        public Carpet(){

                this.unitPrice=0;
                this.isPersian=false;

            }


        public Carpet(double width, double length, double unitPrice, boolean isPersian){
            this.width=width;
            this.length=length;
            this.unitPrice=unitPrice;
            this.isPersian=isPersian;
        }

        public void totalPrice(Carpet carpet){
            isPersian=true;
            if (carpet.isPersian=false){
                System.out.println((carpet.width+carpet.length)*carpet.unitPrice);
            }else{
                System.out.println(((carpet.width+carpet.length)*carpet.unitPrice)+200);
            }


        }

    }
