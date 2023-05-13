1. Find the time complexity of following pseudo code:
func(int n)
    an_v=1
    for (lv=1; lv<=n; lv+=an_v)
        an_v++
        print(“*”)
Ans : O(logn)

2. int func(int n)
    count=0
    for (lv=n; lv>0; lv/=2)
        inner_lv=0
        while(inner_lv < lv)
            inner_lv++
            count+=1

    return count

Ans : o(n)

3. What will be the Output?
class Test 
{ 
    int a; 
    int b; 
    Test() 
    {   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
    Test(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
}
class new_test{
    public static void main(String[] args) 
    { 
        Test object = new Test(); 
    } 
} 

Ans : constructor two constructor one