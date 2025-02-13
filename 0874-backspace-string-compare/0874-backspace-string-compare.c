void compare(char* s){
    int w=0;
    for(int r=0;s[r]!='\0';r++){
        if(s[r]=='#'){
            if(w>0)
            w--;
        }
        else
        s[w++]=s[r];
    }
    s[w]='\0';
}
bool backspaceCompare(char* s, char* t) {
    compare(s);
    compare(t);
    if(strcmp(s,t)){
    return false;
    }
    return true;
}