
//Ecapsulatio
class StaticInsEncap
{
    int a;
    static int b;
     
    public static void main(String[] args)
    {
    	Access a=new Access(); //Refrece
        a.inGet(10,20);
        a.show();
        
    }
   
}
class Access
{
	StaticInsEncap s= new StaticInsEncap();
	  void inGet(int k,int l)
	    {
	    	
	           s.a=k;
	           StaticInsEncap.b=l;
	    }
	 void show()
	    {
	        
	        System.out.println(s.a+" "+ StaticInsEncap.b);
	    }
	    void get(int j,int k)
	    {
	        s.a=j;
	        StaticInsEncap.b=k;
	    }
	   void show1()
	    {
	       
	       System.out.println(s.a+" "+ StaticInsEncap.b);
	    }
}