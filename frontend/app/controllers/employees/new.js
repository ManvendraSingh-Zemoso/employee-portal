import Controller from '@ember/controller';

export default Controller.extend({
  skills: ['Java','Python','PHP','C++','Management','Ember'],
  // previewImage: Ember.observer('file',function () {
  //   var file = document.getElementById('file-field').files[0];
  //   if (file) {
  //     var reader = new FileReader();
  //     reader.onload = function (e) {
  //       $('#preview-image').attr('src', e.target.result);
  //     }
  //     reader.readAsDataURL(file);
  //   }
  // }),
  actions:{
    setImage(){
      var file = document.getElementById('file-field').files[0];
      let picture = this.get('store').createRecord('picture');
      picture.set('image',file);
      let self =this;
      picture.save().then(function (response) {
        self.get('employee').set('picture',response.get('imagePath'));
      });
    },
    cancel(){
      this.get('employee').destroyRecord();
      this.transitionToRoute('employees.index');
    },
    saveModel(){

      this.get('employee').save();
      this.transitionToRoute('employees.index');
    },
    addSkill(item){
      this.get('selectedSkills').pushObject(item);
    },
    removeSkill(item){
      this.get('selectedSkills').removeObject(item);
    }
  },
  emailValidation: [{
    message: 'Please provide email in a valid format',
    validate: (inputValue) => {
      let emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
      return emailPattern.test(inputValue);
    }
  }]
});
