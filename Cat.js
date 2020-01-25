function cat(name){
    this.name=name;
    this.dead = false;
}

cat.prototype.die= function (){
    this.dead=true;
}
module.exports(cat);