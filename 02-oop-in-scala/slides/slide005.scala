

// AnyRef

// This is just java.lang.Object.  Your classes will inherit from this unless you specify extending AnyVal.  Default
// equality is reference equality (different for case classes, which we will cover later).  For classes in the standard
// library, equality is defined sanely so you can use `==` everywhere.  You can check reference equality explicitly with
// `eq` though this is an unlikely occurrence.

val l1 = List(1, 2)
val l2 = List(1, 2)
l1 == l2 // true
l1 eq l2 // false

