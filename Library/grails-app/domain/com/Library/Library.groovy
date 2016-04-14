package com.Library

class Library {

String location

String openingHours

String book

String student

Librarian librarian

String toString(){"$location,$librarian"}

    static constraints = {

		location()

		openingHours()

		book()

		student()

		librarian()

    }
}
