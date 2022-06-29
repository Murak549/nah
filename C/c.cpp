#include <cstdio>
int main() {
    int a = 3;
    int b = 4;
    if(a+b!=b+a) {
        printf("제작 및 공개 ≠ 공개 및 제작");
    } else {
        printf("제작 및 공개 = 공개 및 제작");
    }
    return 0;
}