
// Type Inference con't

val x = 1 + 2 * 3     // the type of x is Int

val y = x.toString()  // the type of y is String

// Types can be inferred in others places
//  - Ex Return types of methods & functions

// Why? Leads to concise code! With static typing!

// Caveats
//   - Is 'local', only considers one expression 
//   - Does not work for return types of recursive functions
//   - Sometimes does not work at all really in advanced cases

