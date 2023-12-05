function Hotel(name,room,booked){
    this.name=name;
    this.room = room;
    this.booked = booked;

    this.checkAbailability = function(){
        return this.room - this.booked
    };

}

var secretosHotel = new Hotel('Secretos', 25, 15);
var sheraton = new Hotel('Sheraton',140,80);

var elSecretos = secrecosHotel.name + ' rooms ';
