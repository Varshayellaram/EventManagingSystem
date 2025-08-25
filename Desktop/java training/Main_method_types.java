class MainMethod{
    //public static void main(String []args)
    //public static void main(String args[])
    //public static void main(String args)
    //public static final void main(String args[])
    //public static strictfp void main(String args[])  // strictfp will give precise value for float or double variables in every platform
    //public static synchronized void main(String args[])
    //static public void main(String[] vargs)//we can change the name of args with another name
    public static void main(String[] args) {  
        double result = 10.0/3.0;
        System.out.println("Hello this is Main method..");
        System.out.println("Result = "+result); //if we use strictfp the result value will always same in all platforms
        
    }
}