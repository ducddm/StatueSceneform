var horse = require('./Horse');
function Cat(){
    this.stomach=[]
}
Cat.prototype.eat = function(animal){
    if (animal instanceof horse) {
        this.stomach.push(animal);
    }
    else {
        throw new Error('ggg!');
    }
};
module.exports=Cat;