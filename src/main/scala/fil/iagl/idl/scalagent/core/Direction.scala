package fil.iagl.idl.scalagent.core

/**
  * The direction of an agent
  */
object Direction extends Enumeration {
  type Direction = Value
  val NORTH, EAST, WEST, SOUTH, NO_DIRECTION  = Value
}
