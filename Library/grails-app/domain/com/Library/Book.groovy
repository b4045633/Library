package com.Library

class Book {

String title

String author

String isbn

Date dateBorrowed

Date returnedDate

Student student

String toString(){"$title,$author"}

    static constraints = {

		title()

		author()

		isbn()

		dateBorrowed()

		returnedDate()

		student()

    }
}
