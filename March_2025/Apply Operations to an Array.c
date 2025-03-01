#include<stdio.h>
int main(){

    int num[6]={1,2,2,1,1,0};
    int n = 6;
    printf("Number of Elements:%d",n);

    for (int i = 0; i < n; i++)
    {
        if(num[i]==num[i+1]){
            num[i]=2*num[i];
            num[i+1]=0;
        }
    }
    printf("\nAnswer:");
    for (int i = 0; i < n; i++)
    {
        printf("%d",num[i]);
    }
    
    printf("\nShifting 0 :");
    int zerindex=0;
    for (int i = 0; i < n; i++)
    {
        if (num[i]!=0)
        {
            num[zerindex]=num[i];
            zerindex++;
        }
    }
    for (int i = zerindex; i < n; i++)
    {
        num[i]=0;
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d",num[i]);
    }

    

    return 0;
}