#include<stdio.h>

int main(){
    char s[] = "ab";
    int i;
    for(int i=0;s[i];i++){
        printf("\n %c %c %c %c", s[i], *(s+i), *(i+s), i[s]);
    }
}