class genericClass<T>{
    T a;
    void fun(T b){
        a=b;
        System.out.println(a);
    }    
}
class serialGX{
    public static void main(String[] args) {
        genericClass<Integer> obj=new genericClass<Integer>();
        genericClass<String> obj1=new genericClass<String>();
        obj.fun(10);
        obj1.fun("hello");
    }
}
