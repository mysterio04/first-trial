#include <stdio.h>

int main()

{
    int x,i,f;
    scanf("%d",&x);
    for(i=1,f=1;(i<=x);i=i+1)
          f=(f*i);
     printf("the factorial is %d",f);
    return 0;
}
