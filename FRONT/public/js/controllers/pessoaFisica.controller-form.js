(function () {
    "use strict";

    angular
        .module("MyApp")
        .controller("PessoaFisicaFormController", PessoaFisicaFormController);

    PessoaFisicaFormController.$inject = [
        "PessoaFisicaService",
        "$location",
        "$routeParams",
        "$scope",
    ];

    function PessoaFisicaFormController(
        PessoaFisicaService,
        $location,
        $routeParams
    ) {
        var vm = this;
        vm.cadastro = {};
        vm.titulo = "Nova Pessoa Fisica";
        vm.item = null;
        vm.salvar = salvar;
        vm.select = select;

        activate();

        function activate() {
            if ($routeParams.id) {
                PessoaFisicaService.findById($routeParams.id).success(function (data) {
                    vm.cadastro = data;
                    vm.titulo = "Editando Pessoa Fisica";
                });
            }
        }

        function salvar() {
            PessoaFisicaService.save(vm.cadastro).success(function () {
                $location.path("/pessoa-fisica");
                alert("Pessoa Fisica cadastrada com sucesso!!");
            }).error(function (erro) {
                alert(JSON.stringify(erro));
            });
        }

    function select(valor){
        return '"'+valor+'"';
    }

    }
})();