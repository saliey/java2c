package com.stormmq.java2c.model.allocation;

public enum Allocator
{
	Stack,
	ManualHeap,
	ReferenceCountedHeap,
	GarbageCollectedHeap,

	// TODO: Memory alignment as well
}

/*

	For Stack, the following would happen:-

		For a struct:-

			final struct MyStruct instance = { <constructor arguments less the first one, > };
			// To solve: can {} be omitted if there are no arguments
			// To solve: exceptions thrown by struct constructors
			// To solve: struct constructors that do more than set values

		For a class:-

			final struct MyClass instance = <constructor logic, using variable length arrays [not alloca]>
			// To solve: variable length arrays do not work


 */
