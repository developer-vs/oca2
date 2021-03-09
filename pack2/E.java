
// error: A is not public in pack1; 
// cannot be accessed from outside package
// import pack1.A;

import pack1.*; // ok

class E extends D {} // ok, if in the same default package