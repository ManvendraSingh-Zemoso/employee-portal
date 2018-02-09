import Controller from '@ember/controller';

export default Controller.extend({
  actions:{
    edit(param){
      this.transitionToRoute('employees.edit',param)
    },
    cancel(){
      this.transitionToRoute('employees.index');
    }
  }
});
