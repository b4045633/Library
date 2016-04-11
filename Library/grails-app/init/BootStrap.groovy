import com.library.*

class BootStrap {

    def init = { servletContext ->

def librarian1= new Librarian(name:'Anthony ige',

		email:'A.ige@hotmail.co.uk',

		telephone:'07984635276',).save()


def library1= new Library(location:'Sheffield',

		openingHours: '9.00 am',

		book:'Programming',

		student:'Shola Banjo',

		librarian:'Anthony Ige',).save()

def book= new Book(title:'Programming',

		author:'John Doe',
		
		isbn:'9834',

		dateBorrowed:'new Date('21/05/2015'),

		dateReturned:'new Date('30/05/2015'),

		student:'Shola Banjo',).save()

def student= new Student(name:'Shola Banjo',

		email:'Sbanjo@hotmail.com',

		studentId:'B4045783',

		course:'Civil Engineering',).save()

def course= new Course(title:'Civil Engineering',

		code:'E101',

		tutor:'Ishmael Smart',

		department:'Engineering',

		description:'4 year Engineering course',).save()

    }
    def destroy = {
    }
}
