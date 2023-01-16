public class Main {
    public static void main(String[] args){
        BurgerStall burgerstall = new BurgerStall (new String[] {"a","b"}); //To initialize the object with parameter array (follow constructor)
        burgerstall.sold("a",20);
        burgerstall.sold("b",80);
        burgerstall.totalSold();
    }
}

/*BURGER STALL
- ID
- No. of burger sold for the day
 */
class BurgerStall{
    /* Instance Variable*/
    //Create an array as there are >1 stalls
    String[] stallID;
    int[] burgerSold;

    public BurgerStall (String[] stallID){
        this.stallID = stallID;
        this.burgerSold = new int[stallID.length]; //Array length same as stallID Array
    }

    /*Sold Method that increment number of burger sold by parameter value
    - Parameter pass in: StallID & num of burger sold
    - Matching the stall ID in array, if matched, will sum with the ori num stored
     */

    public void sold(String stallID, int burgersSold){
        for(int i = 0; i<this.stallID.length; i++){
            if(this.stallID[i].equals(stallID)){
                this.burgerSold[i] += burgersSold;
                break;
            }
        }
    }

    public void totalSold(){
        int totalSold = 0; //Must initialize this var in its method
        // Loop through array of burgerSold and add it to the totalSold
        for(int i = 0; i<this.stallID.length; i++) {
            totalSold += this.burgerSold[i];
            System.out.printf("Store %s sold %d burgers \n", this.stallID[i], this.burgerSold[i]);
        }
        System.out.println("Total Burgers sold: " + totalSold + " burgers");
        }
    }
