import Controller from '@ember/controller';
import { filter } from '@ember/object/computed';
import { computed } from '@ember/object';
import { A } from '@ember/array';

export default Controller.extend({
  roles: A(['Engineer','Developer','Manager','Director']),
  locations: A(['Hyderabad','Bangalore','Texas']),
  departments: A(['Development','Management','Maintenance']),
  projects: A(['Project 1','Project 2','Project 3']),
  skills: A(['Java','Python','PHP','C++','Management','Ember']),
  selectedSkills: A([]),
  remainingSkills: computed('selectedSkills.length', function() {
    return this.get('skills').filter((source) => {
      return !this.get('selectedSkills').any(function(mySkill) {
        return source === mySkill;
      });
    });
  }),
  previewImage: Ember.observer('file',function () {
    var file = document.getElementById('file-field').files[0];
    if (file) {
      var reader = new FileReader();
      reader.onload = function (e) {
        $('#preview-image').attr('src', e.target.result);
      }
      reader.readAsDataURL(file);
    }
  }),
  actions:{
    cancel(){
      this.get('employee').destroyRecord();
      this.transitionToRoute('employees.index');
    },
    saveModel(){
      this.get('employee').save();
      alert("Employee Added!");
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
  }],
});
