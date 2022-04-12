#include <stdio.h>

int main() {
    int a[10] = {1,2,1,4,5,4,4,4,5,1};
    int frequency = 1;
    for(int i=0;i<10;i++){
        if(a[i] == NULL) continue;
        for(int j=i+1;j<10;j++){
            if(a[i] == a[j]) {
                frequency++;
                a[j] = NULL;
            }
        }
        printf("Frequency of # %d = %d  \n",a[i],frequency);
       frequency = 1;
    }
    return 0;
}
