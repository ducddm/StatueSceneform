var Dog = require('./Dog');
var Cat = require('./Cat');

var dog = new Dog("Tom");
var tom = new Cat();
dog.sayHi();

var Horse = require('./Horse');
var horse = new Horse;

tom.eat(horse);
console.log(tom);