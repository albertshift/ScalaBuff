// Generated by ScalaBuff, the Scala protocol buffer compiler. DO NOT EDIT!
// source: enum.proto

package resources.generated

object ComputerPeripherals extends net.sandrogrzicic.scalabuff.Enum {
	sealed trait EnumVal extends Value
	val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

	val MOUSE = new EnumVal { val name = "MOUSE"; val id = 1 }
	val KEYBOARD = new EnumVal { val name = "KEYBOARD"; val id = 2 }

	val MOUSE_VALUE = 1
	val KEYBOARD_VALUE = 2

	def valueOf(id: Int) = id match {
		case 1 => MOUSE
		case 2 => KEYBOARD
		case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
	}
	val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
		def findValueByNumber(id: Int): EnumVal = valueOf(id)
	}
}
final case class Outer (
	innerRequired: Outer.Inner.EnumVal = Outer.Inner._UNINITIALIZED,
	innerOptional: Option[Outer.Inner.EnumVal] = None,
	innerRepeated: Vector[Outer.Inner.EnumVal] = Vector.empty[Outer.Inner.EnumVal]
) extends com.google.protobuf.GeneratedMessageLite
	with net.sandrogrzicic.scalabuff.Message[Outer] {


	def setInnerOptional(_f: Outer.Inner.EnumVal) = copy(innerOptional = _f)
	def setInnerRepeated(_i: Int, _v: Outer.Inner.EnumVal) = copy(innerRepeated = innerRepeated.updated(_i, _v))
	def addInnerRepeated(_f: Outer.Inner.EnumVal) = copy(innerRepeated = innerRepeated :+ _f)
	def addAllInnerRepeated(_f: Outer.Inner.EnumVal*) = copy(innerRepeated = innerRepeated ++ _f)
	def addAllInnerRepeated(_f: TraversableOnce[Outer.Inner.EnumVal]) = copy(innerRepeated = innerRepeated ++ _f)

	def clearInnerRequired = copy(innerRequired = Outer.Inner._UNINITIALIZED)
	def clearInnerOptional = copy(innerOptional = None)
	def clearInnerRepeated = copy(innerRepeated = Vector.empty[Outer.Inner.EnumVal])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeEnum(1, innerRequired)
		if (innerOptional.isDefined) output.writeEnum(2, innerOptional.get)
		for (_v <- innerRepeated) output.writeEnum(3, _v)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeEnumSize(1, innerRequired)
		if (innerOptional.isDefined) size += computeEnumSize(2, innerOptional.get)
		for (_v <- innerRepeated) size += computeEnumSize(3, _v)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Outer = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var _innerRequired: Outer.Inner.EnumVal = Outer.Inner._UNINITIALIZED
		var _innerOptional: Option[Outer.Inner.EnumVal] = innerOptional
		val _innerRepeated: collection.mutable.Buffer[Outer.Inner.EnumVal] = innerRepeated.toBuffer

		def _newMerged = Outer(
			_innerRequired,
			_innerOptional,
			Vector(_innerRepeated: _*)
		)
		while (true) in.readTag match {
			case 0 => return _newMerged
			case 8 => _innerRequired = Outer.Inner.valueOf(in.readEnum())
			case 16 => _innerOptional = Outer.Inner.valueOf(in.readEnum())
			case 24 => _innerRepeated += Outer.Inner.valueOf(in.readEnum())
			case default => if (!in.skipField(default)) return _newMerged
		}
		null // compiler needs a return value
	}

	def mergeFrom(m: Outer) = {
		Outer(
			m.innerRequired,
			m.innerOptional.orElse(innerOptional),
			innerRepeated ++ m.innerRepeated
		)
	}

	def getDefaultInstanceForType = Outer.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = this
	def toBuilder = this
}

object Outer {
	@reflect.BeanProperty val defaultInstance = new Outer()

	val INNER_REQUIRED_FIELD_NUMBER = 1
	val INNER_OPTIONAL_FIELD_NUMBER = 2
	val INNER_REPEATED_FIELD_NUMBER = 3

	object Inner extends net.sandrogrzicic.scalabuff.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

		val FIRST = new EnumVal { val name = "FIRST"; val id = 1 }
		val SECOND = new EnumVal { val name = "SECOND"; val id = 2 }

		val FIRST_VALUE = 1
		val SECOND_VALUE = 2

		def valueOf(id: Int) = id match {
			case 1 => FIRST
			case 2 => SECOND
			case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

}

object Enum {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
