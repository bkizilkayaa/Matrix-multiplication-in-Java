public class usingArrayCopy {

    public static void printArray(int[] ArraysToShown)
    {
        for (int number:ArraysToShown)
        {
            System.out.print(number + " ");
        }
    }
    public static void main(String[] args) {
        int[] mainArray={1,2,3,6,7,8};
        int[] copiedArray=new int[mainArray.length];
        int[] copiedArrayTest=new int[mainArray.length];

        for (int i=0;i<mainArray.length;i++)
        {
            copiedArray[i]=mainArray[i];
        }
        System.out.println("Manually copied");
        printArray(copiedArray);
        //our main array successfully copied! but that's not enough...
        //and then i'll use arraycopy method in the following section
        System.out.println("\nCopied with using arraycopy method");
        int copiedArrayButMethod[] = new int[mainArray.length];
        System.arraycopy(mainArray,0,copiedArrayButMethod,0,mainArray.length);
        //in this section, we did same job using the arraycopy method.
        printArray(copiedArrayButMethod);


        System.arraycopy(mainArray,0,copiedArrayTest,0,mainArray.length);
        //in this section, im trying something.
        //we have 2 arrays named mainArray and copiedArrayTest which has same values
        //and i change the value of mainArray's first index to 400
        //let's take a look what's happened to our two arrays

        copiedArrayTest=mainArray;
        mainArray[0]=400; //im changing the value after i equalize the arrays.
        System.out.println("\nChanging main array");  //let's print the mainArray
        printArray(mainArray);
        //mainArray affected, but copiedArrayTest affected too after i equalize them.
        System.out.println("\nBut....copiedArrayTest affected too!");
        printArray(copiedArrayTest);

        //its because it works with reference system
        //when we equalize two arrays
        //we actually equalized the addresses they show











    }
}
