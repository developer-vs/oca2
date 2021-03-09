package pack2;

// error: A is not public in pack1; 
// cannot be accessed from outside package
// If data type isn't "public", it can't be imported
// import pack1.A;

import pack1.*;


// error: A is not public in pack1; 
// cannot be accessed from outside package
// class B extends A {}
// class B extends pack1.A {}

class B {}