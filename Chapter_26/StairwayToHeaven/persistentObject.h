/*
26_29
*/

#ifndef STAIRWAYTOHEAVENASSEMBLY_H
#define STAIRWAYTOHEAVENASSEMBLY_H

#include <iostream>

class PersistentObject
{
	public:
		virtual ~PersistentObject();
		virtual void write(ostream&) const;
	
	protected:
		virtual void writeFields(ostream&) const = 0;
		
	private:
		virtual void writeHeader(ostream&) const = 0;
		virtual void writeFooter(ostream&) const = 0;
};
#endif