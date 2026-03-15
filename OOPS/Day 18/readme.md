# Autoboxing / unboxing

# POJO Classes
// also called model classes.
// plain old java object.
// Simple se operation.

class sample{
    int x;
    itn y;
    Sample(int x,int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return x;
    }
    int setX(int x){
        this.x = x;
    }
}

// POJO -> hard code business logic nahi hone chahiye.
// getter,setter, Constructor, simple buisness logic 


     POJO
     /   \
Anemic Model,        Rich Domain Model
=> normal getter          => Buiness logic
setter,field,constuctor