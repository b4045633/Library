package com.Library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

   void toString() {
when:"A Course has title and department"

def course1= new Course(title:'Civil Engineering',

			department:'Engineering')

then:"the to String method will merge them."

course.toString()=='Civil Engineering,Engineering'
            
    }
}
