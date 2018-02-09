import Controller from '@ember/controller';

export default Controller.extend({
  actions:{
      saveEditedModel(){
        this.get('employee').save();
        this.transitionToRoute('employees.index');
      },
      cancel(){
        this.transitionToRoute('employees.index');
      },
    setImage(){
      var file = document.getElementById('file-field').files[0];
      let picture = this.get('store').createRecord('picture');
      picture.set('image',file);
      let self =this;
      picture.save().then(function (response) {
        self.get('employee').set('picture',response.get('imagePath'));
      });
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
