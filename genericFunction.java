class gx{
    <T> void fun(T b){
        System.out.println(b.getClass().getName());
    }
}
class genericFunction{
    public static void main(String[] args) {
        gx obj=new gx();
        obj.fun(10);
        obj.fun("hello");
        obj.fun('A');
        obj.fun(100.11);
    }

}
