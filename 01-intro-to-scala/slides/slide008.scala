
/* Immutability

1) Easier to reason about what code does. 
2) Eliminates sources of subtle bugs.
3) Good style.
4) A building block for 'referential transparency' 

"Prefer vals, immutable objects, and methods 
without side effects. Reach for them first. 
Use vars, mutable objects, and methods with 
side effects when you have a specific need 
and justification for them." - Odersky

Note: Scala defaults to vals in most places.
      ex. function parameters are immutable
*/

