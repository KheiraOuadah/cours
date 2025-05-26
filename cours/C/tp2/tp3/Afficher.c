#include <stdio.h>

int main(void)
{
    float a = 0.001;
    float b = 0.003;
    float c, *pa, *pb, *pp;
    pa = &a;
    *pa *= 2;
    pb = &b;
    c = 3 * (*pb - *pa);
    pp = pa;
    printf("%f ; %f ; %f ; %p ;%f ; %p ;%p ; %f ;%p ; %f ;\n"
    ,a,b,c,pa,*pa,&*pa,pb,*pb,pp,*pp);
}