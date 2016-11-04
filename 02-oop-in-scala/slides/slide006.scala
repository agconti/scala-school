

// Unit and Nothing

// You will very rarely use Nothing.  The only practical case is when you need a type that represents no type.
// Most likely you will encounter Nothing when the compiler doesn't know how to infer a type and therefore barfs an
// error that mentions Nothing.

def error(msg: String): Nothing = throw new Exception(msg)

// Unit is a type that is like Java's void.  This is used to indicate the return type of a method that side-effects.

def log(msg: String): Unit = println(msg)

